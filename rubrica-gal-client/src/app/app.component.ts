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
  title(title: any) {
    throw new Error('Method not implemented.');
  }
  
  // MODIFICA FATTA DA FEDERICO 08/02/21
  contatto: Contatto = new Contatto();
  rubrica: Contatto[] = [];
  
  constructor(private http: HttpClient) { }




  inserisci() {
    let dto = new Contatto();
    dto.nome = this.contatto.nome;
    dto.cognome = this.contatto.cognome;
    dto.telefono = this.contatto.telefono;
    this.rubrica.push(this.contatto);
    let ox: Observable<Contatto[]> = this.http
      .post<Contatto[]>("http://localhost:8080/inserisciContatto",
        dto);
        ox.subscribe(r => this.rubrica = r)

  }

  rimuovi() {
// Non funziona per adesso
  }

}
