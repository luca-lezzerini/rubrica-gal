import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contatto } from './contatto';
import { Observable } from 'rxjs';
import { Risposta } from './Risposta';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }

  contatto: Contatto = new Contatto();
  risposta: Risposta;

  constructor(private http: HttpClient) { }

  stato = "ins";

  inserisci() {
    let dto = new Contatto();
    dto.nome = this.contatto.nome;
    dto.cognome = this.contatto.cognome;
    dto.telefono = this.contatto.telefono;
    let ox: Observable<Risposta> = this.http
      .post<Risposta>("http://localhost:8080/inserisciContatto",
        dto);
    ox.subscribe(r => this.risposta.risp= r.risp)
    // function (r) {this.contatto = r.risp }
    this.stato = "mod";
  }

  rimuovi() {
    let dto = new Contatto();
    dto.nome = this.contatto.nome;
    dto.cognome = this.contatto.cognome;
    dto.telefono = this.contatto.telefono;
    let ox: Observable<Risposta> = this.http
      .post<Risposta>("http://localhost:8080/eliminaContatti",
        dto);
    ox.subscribe(r => this.risposta.risp= r.risp)
    this.stato = "ins";
  }

  recupera() {
    this.stato = "ins";
  }

  svuota() {
    let dto = new Contatto();
    dto.nome = this.contatto.nome;
    dto.cognome = this.contatto.cognome;
    dto.telefono = this.contatto.telefono;
    let ox: Observable<Risposta> = this.http
      .post<Risposta>("http://localhost:8080/svuotaRubrica",
        dto);
    ox.subscribe(r => this.risposta.risp= r.risp)
    this.stato = "ins";
  }

  indietro() {
    this.stato = "ins";
  }
}
