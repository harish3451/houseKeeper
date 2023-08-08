import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from 'src/app/class/admin';
import { AdminService } from 'src/app/service/admin.service';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.css']
})
export class LogInComponent {

  empId!:number;
  password!:string;
  admin!:Admin;
  invalidCredentials:boolean = false;
  loggedIn:boolean=false;
  constructor(private adminService:AdminService,private router:Router){}

  logIn(){
    this.adminService.getAdmin(this.empId).subscribe(
      resposne => {this.admin = resposne;
        if(this.admin.admin_password == this.password){
          this.loggedIn=true;
          this.router.navigate(['admin/home']);
        }
        else{
          this.invalidCredentials=true;
        }
      },
      error => {this.invalidCredentials=true;return;}
    );
  }
}
