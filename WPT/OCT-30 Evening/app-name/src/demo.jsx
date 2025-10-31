import { Component } from "react";
import { LoginForm } from "./loginForm";
import { SignUpForm } from "./SignUpForm";
export class Demo extends Component {
    
    render(){
        return(
            <div>
                <h1>This is demo class Component</h1>
                <div></div>
                <LoginForm></LoginForm>
                <SignUpForm/>
            </div>
        )
    }
}