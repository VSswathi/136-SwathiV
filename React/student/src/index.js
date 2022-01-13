import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

//working with forms
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

class StudentForm extends React.Component{
  constructor(props){
    super(props);
    this.state = {stname:'',lname:'',email:'',pass:'',isPass:true, gender:''};
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event){
    //this.setState({value: event.target.value});
    const target = event.target;
    const value = target.name === "isPass" ? target.checked: target.value;
    const name = target.name;

    console.log(name +" "+ value);
    this.setState({[name]:value});
  }

  handleSubmit(event){
    alert('Are you sure you want to submit your country? '+this.state.stname+" "+ this.state.isPass);
    event.preventDefault();
  }


  render(){
    return(
      <form onSubmit={this.handleSubmit}>
        <label>
          Name: 
          <input name="stname" type="text" value={this.state.stname} onChange={this.handleChange}/>
        </label><br/>
        <label>
          Last Name: 
          <input name="lname" type="text" value={this.state.lname} onChange={this.handleChange}/>
        </label><br/>
        <label>
          Email: 
          <input name="email" type="text" value={this.state.email} onChange={this.handleChange}/>
        </label><br/>
        <label>
          Password: 
          <input name="pass" type="text" value={this.state.pass} onChange={this.handleChange}/>
        </label><br/>
        <label>
          IsPass?
          <input name="isPass" type="checkbox" checked={this.state.isPass} onChange={this.handleChange}/>
        </label><br/>
        <label>
          Gender: 
          <select value={this.state.value} onChange={this.handleChange}>
            <option value='Female'>Female</option>
            <option value='Male'>Male</option>
            <option value='Others'>Others</option>
          </select>
        </label><br/>
        <input type="submit" value="Submit" />
      </form>
    );
  }
}

ReactDOM.render(  
  <StudentForm /> ,
document.getElementById('root')
);