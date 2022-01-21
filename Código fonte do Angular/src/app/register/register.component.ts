import { Component, OnInit } from '@angular/core';
import { UserModel } from '../model/UserModel';
import { UserService } from '../service/user.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  userModel:UserModel = new UserModel
  okEmail = false
  okTelefone= false
  constructor( 
    private service : UserService
  ) { }

  ngOnInit() {
    window.scroll(0,0)
  }
  
  save(){
    const emailRegex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    
    if(this.userModel.nome.length < 2){
      alert("Digite um nome válido")
    }else if(this.userModel.telefone.length < 9 || this.userModel.telefone.length > 14){
      alert("Digite um telefone válido")
    }
    else if(this.userModel.email.match(emailRegex)){
      this.service.saveUser(this.userModel).subscribe((resp: UserModel)=>{
        this.userModel=resp;
        alert("Cadastrado com sucesso")
        window.location.reload()
      })
    }else{
      alert("Digite um email válido")
    }
  }
}
