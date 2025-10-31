import { Component } from "react";

export class LoginForm extends Component {
    
    render(){
        return(
            <from>
                <input type="text" placeholder="Enter Name"/>
                <br/><br/>
                <input type="password" placeholder="Enter Password"/>
                <br/><br/>
                <input type="submit" value="login"/>
            </from>
        )
    }
}