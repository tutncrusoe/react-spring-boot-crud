import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import HeaderComponent from "./components/HeaderComponent";
import ListEmployeeComponent from "./components/ListEmployeeComponent";
import CreateEmployeeComponent from "./components/CreateEmployeeComponent";
import ViewEmployeeComponent from "./components/ViewEmployeeComponent";
import UpdateEmployeeComponent from "./components/UpdateEmployeeComponent";
import FooterComponent from "./components/FooterComponent";

function App() {
    return (
        <div>
            <Router>
                <HeaderComponent/>
                <div className="container">
                    <Switch>
                        <Route path="/" exact component={ListEmployeeComponent}></Route>
                        <Route path="/employees" component={ListEmployeeComponent}></Route>
                        <Route path="/add-employee/:id" component={CreateEmployeeComponent}></Route>
                        <Route path="/view-employee/:id" component={ViewEmployeeComponent}></Route>
                         {/*<Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route>*/}
                    </Switch>
                </div>
                <FooterComponent/>
            </Router>
        </div>

    );
}

export default App;
