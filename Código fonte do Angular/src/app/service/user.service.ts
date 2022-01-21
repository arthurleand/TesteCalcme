import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { UserModel } from '../model/UserModel';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(
    private http: HttpClient
  ) { }

  saveUser(userModel : UserModel) : Observable<UserModel>{
    return this.http.post<UserModel>('http://localhost:8080/user', userModel)
  }
}

