import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contatto } from './contatto';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  rubrica: Contatto[] = [];
  nomeC: String;
  cognomeC: String;
  telefonoC: String;

  constructor(private http: HttpClient) { }




  inserisci() {
    let dto = new Contatto();
    dto.nome = this.nomeC;
    dto.cognome = this.cognomeC;
    dto.telefono = this.telefonoC;
    let ox: Observable<Contatto[]> = this.http
      .post<Contatto[]>("http://localhost:8080/rubrica",
        dto);
        ox.subscribe(r => this.rubrica = r)

  }

  rimuovi() {

  }

}
