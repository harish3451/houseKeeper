import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Admin } from '../class/admin';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  admins:Admin[] =[];
  admin !:Admin;

  adminURL:string ='http://localhost:7070/admin'

  constructor(private http:HttpClient) { }

  getAdmin(id:number){
    return this.http.get<Admin>(this.adminURL+`/${id}`)
  }
}
