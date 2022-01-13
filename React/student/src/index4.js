import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

function Addition(props){
  let result=parseInt(props.a)+parseInt(props.b);
  let result1=parseInt(props.a)-parseInt(props.b);
  let result2=parseInt(props.a)*parseInt(props.b);
  let result3=parseInt(props.a)/parseInt(props.b);
  return <h1>calculation {props.a} and {props.b} add={result} sub={result1} mul={result2} div={result3}</h1>
}
ReactDOM.render(
  <Addition a="10" b="20"/>,
  document.getElementById('root')
);