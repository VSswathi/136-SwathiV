import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
class CurrencyCalc extends React.Component
{
  constructor(props)
  {
    super(props);
    this.state = {
     value:"",
      c : "",
      result:""
    };
    this.rHandler = this.rHandler.bind(this);
    this.yHandler = this.yHandler.bind(this);
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
   
  }
  handleChange(event){
    this.setState({value: event.target.value})
   
  }
  rHandler(event)
  {
    this.setState(
      {c: " Indian Rupees"}
    );
    this.setState(
      {result: this.state.value*74.52}
     );
    

  }
  yHandler(event)
  {
    this.setState(
      {c: " Japanese Yen"}
    );
    this.setState(
      {result: this.state.value*115.81}
     );
    
    
  }
  handleSubmit(event){
    alert(this.state.value+"Dollar is "+ this.state.result+ this.state.c);
    event.preventDefault();
   
  }

  render()
  {const val=this.state.value;
    return(    <fieldset> <legend>Enter the amount :</legend>
      <form onSubmit={this.handleSubmit}>
        <lable>
          
          <input type="text" value={val} onChange={this.handleChange} /> <br></br> <br></br>
        </lable><button onClick={this.rHandler}>Rupees</button>
    <button onClick={this.yHandler}>Yen</button>
     </form></fieldset> 
    );
  }
}


ReactDOM.render(
  <CurrencyCalc />,
  document.getElementById("root")
);