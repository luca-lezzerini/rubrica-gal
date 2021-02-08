import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ContattoReq } from './contattoReq';

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
  contatto: ContattoReq = new ContattoReq();
  
  constructor(private http: HttpClient) { }




    inserisci() {
    let dto = new ContattoReq();
    dto.nome = this.contatto.nome;
    dto.cognome = this.contatto.cognome;
    dto.telefono = this.contatto.telefono;
    let ox: Observable<ContattoReq> = this.http
      .post<ContattoReq>("http://localhost:8080/inserisciContatto",
        dto);
        ox.subscribe(r => this.contatto = r)
        
      }
      
      rimuovi() {
        // Non funziona per adesso
      }
      
      recupera(){
        let dto = new ContattoReq();
        let ox: Observable<ContattoReq> = this.http
        .post<ContattoReq>("http://localhost:8080/recuperaContatti",
          dto);
          ox.subscribe(r => this.contatto = r)

      }
      
      cancella(){
        let dto = new ContattoReq();
        let ox: Observable<ContattoReq> = this.http
        .post<ContattoReq>("http://localhost:8080/svuoataRubrica",
          dto);
          ox.subscribe(r => this.contatto = r)
      }
      
}

