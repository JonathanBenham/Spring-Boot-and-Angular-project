import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

const httpOptions = {
	headers: new HttpHeaders({'Content-Type': 'application/json'})
};


@Injectable()
export class MotorcycleService {

  constructor(private http:HttpClient) { }

  getMotorcycles(){
		let token = localStorage.getItem('access_token');
  	return this.http.get('/server/api/v1/motorcycles',
    {headers: new HttpHeaders().set('Authorization','Bearer '+ token)}
	);
  }

	getMotorcycle(id: number){
		let token = localStorage.getItem('access_token');
  	return this.http.get('/server/api/v1/motorcycles' + id,
		{headers: new HttpHeaders().set('Authorization','Bearer ' + token)}
	);
  }

	createMotorcyclesRegistration(motorcycle){
		let body = JSON.stringify(motorcycle);
		return this.http.post('/server/api/v1/motorcycles', body, httpOptions);
	}
}
