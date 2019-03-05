import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

let div;

beforeEach(() => {
  div = document.createElement('div');
  ReactDOM.render(<App />, div);
});

afterEach(() => {
  ReactDOM.unmountComponentAtNode(div);
});

it('has an id', () => {
  expect(div.querySelector('#appId')).toBeTruthy();
});

