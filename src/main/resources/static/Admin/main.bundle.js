webpackJsonp(["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/app.component.css":
/***/ (function(module, exports) {

module.exports = ".row {  \r\n    display: -ms-flexbox; /* IE10 */\r\n    display: -webkit-box;\r\n    display: flex;\r\n    -ms-flex-wrap: wrap; /* IE10 */\r\n    flex-wrap: wrap;\r\n}\r\n\r\n.side {\r\n    -ms-flex: 20%; /* IE10 */\r\n    -webkit-box-flex: 20%;\r\n            flex: 20%;\r\n    background-color: #86b888;\r\n    padding: 20px;\r\n}\r\n\r\n.main {   \r\n    -ms-flex: 70%; /* IE10 */\r\n    -webkit-box-flex: 70%;\r\n            flex: 70%;\r\n    background-color: white;\r\n    padding: 20px;\r\n}"

/***/ }),

/***/ "./src/app/app.component.html":
/***/ (function(module, exports) {

module.exports = "<app-header></app-header>\n<app-navbar></app-navbar>\n<div class=\"row\">\n  <app-menu class=\"side\"></app-menu>\n  <div class=\"main\">\n    <router-outlet></router-outlet>\n  </div>\n</div>\n<app-footer></app-footer>"

/***/ }),

/***/ "./src/app/app.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = (function () {
    function AppComponent() {
        this.title = 'app';
    }
    AppComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-root',
            template: __webpack_require__("./src/app/app.component.html"),
            styles: [__webpack_require__("./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__("./node_modules/@angular/platform-browser/esm5/platform-browser.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__angular_router__ = __webpack_require__("./node_modules/@angular/router/esm5/router.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_angular_webstorage_service__ = __webpack_require__("./node_modules/angular-webstorage-service/bundles/angular-webstorage-service.es5.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__angular_forms__ = __webpack_require__("./node_modules/@angular/forms/esm5/forms.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__routes__ = __webpack_require__("./src/app/routes.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__app_component__ = __webpack_require__("./src/app/app.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__header_header_component__ = __webpack_require__("./src/app/header/header.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__navbar_navbar_component__ = __webpack_require__("./src/app/navbar/navbar.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__menu_menu_component__ = __webpack_require__("./src/app/menu/menu.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__main_main_component__ = __webpack_require__("./src/app/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__footer_footer_component__ = __webpack_require__("./src/app/footer/footer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_14__create_company_create_company_component__ = __webpack_require__("./src/app/create-company/create-company.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_15__create_customer_create_customer_component__ = __webpack_require__("./src/app/create-customer/create-customer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_16__companies_companies_component__ = __webpack_require__("./src/app/companies/companies.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_17__customers_customers_component__ = __webpack_require__("./src/app/customers/customers.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_18__company_company_component__ = __webpack_require__("./src/app/company/company.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_19__customer_customer_component__ = __webpack_require__("./src/app/customer/customer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_20__update_customer_update_customer_component__ = __webpack_require__("./src/app/update-customer/update-customer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_21__update_company_update_company_component__ = __webpack_require__("./src/app/update-company/update-company.component.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};






















var AppModule = (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */],
                __WEBPACK_IMPORTED_MODULE_8__header_header_component__["a" /* HeaderComponent */],
                __WEBPACK_IMPORTED_MODULE_9__navbar_navbar_component__["a" /* NavbarComponent */],
                __WEBPACK_IMPORTED_MODULE_10__menu_menu_component__["a" /* MenuComponent */],
                __WEBPACK_IMPORTED_MODULE_11__main_main_component__["a" /* MainComponent */],
                __WEBPACK_IMPORTED_MODULE_12__footer_footer_component__["a" /* FooterComponent */],
                __WEBPACK_IMPORTED_MODULE_14__create_company_create_company_component__["a" /* CreateCompanyComponent */],
                __WEBPACK_IMPORTED_MODULE_15__create_customer_create_customer_component__["a" /* CreateCustomerComponent */],
                __WEBPACK_IMPORTED_MODULE_16__companies_companies_component__["a" /* CompaniesComponent */],
                __WEBPACK_IMPORTED_MODULE_17__customers_customers_component__["a" /* CustomersComponent */],
                __WEBPACK_IMPORTED_MODULE_18__company_company_component__["a" /* CompanyComponent */],
                __WEBPACK_IMPORTED_MODULE_19__customer_customer_component__["a" /* CustomerComponent */],
                __WEBPACK_IMPORTED_MODULE_20__update_customer_update_customer_component__["a" /* UpdateCustomerComponent */],
                __WEBPACK_IMPORTED_MODULE_21__update_company_update_company_component__["a" /* UpdateCompanyComponent */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_3_angular_webstorage_service__["a" /* StorageServiceModule */],
                __WEBPACK_IMPORTED_MODULE_5__angular_http__["b" /* HttpModule */],
                __WEBPACK_IMPORTED_MODULE_4__angular_forms__["a" /* FormsModule */],
                __WEBPACK_IMPORTED_MODULE_2__angular_router__["a" /* RouterModule */].forRoot(__WEBPACK_IMPORTED_MODULE_6__routes__["a" /* appRoutes */])
            ],
            providers: [__WEBPACK_IMPORTED_MODULE_13__server_webapi_service__["a" /* WebapiService */]],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_7__app_component__["a" /* AppComponent */]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/companies/companies.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/companies/companies.component.html":
/***/ (function(module, exports) {

module.exports = "\n<h1>\n  Companies</h1>\n<div class=\"ui middle aligned divided list\">\n  <div class=\"item\" *ngFor=\"let company of Companies\">\n    <div class=\"right floated content\">\n      <div class=\"ui button\" routerLink=\"../updateCompany\"  (click)=\"UpdateButton($event,company)\">Update</div>\n    </div>\n    <div class=\"right floated content\">\n      <div class=\"ui button\" (click)=\"RemoveButton($event,company)\">Remove</div>\n    </div>\n    <div class=\"right floated content\">\n      <div class=\"ui button\" routerLink=\"../Company\"  (click)=\"detailsButton($event,company)\">details</div>\n    </div>\n    <div class=\"ui big horizontal divided list\">\n      <div class=\"item\">\n        <div class=\"content\">\n          <div class=\"header\"> {{company.compName}}</div>\n        </div>\n      </div>\n      <!--begin-->\n      <div class=\"item\">\n        <div class=\"content\">\n          <div class=\"header\"> {{company.email}}</div>\n        </div>\n      </div>\n      <!-- end -->\n\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/companies/companies.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CompaniesComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CompaniesComponent = (function () {
    function CompaniesComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CompaniesComponent.prototype.ngOnInit = function () {
        this.loadData();
    };
    CompaniesComponent.prototype.UpdateButton = function (event, company) {
        console.log("UpdateButton " + event);
        this.webapiService.changeMessage(company);
    };
    CompaniesComponent.prototype.RemoveButton = function (event, company) {
        console.log("RemoveButton " + event);
        this.webapiService.removeCompany(company).subscribe(function (res) {
        });
        this.loadData();
    };
    CompaniesComponent.prototype.detailsButton = function (event, company) {
        console.log("RemoveButton " + event);
        console.log("company " + company);
        this.webapiService.changeMessage(company);
    };
    CompaniesComponent.prototype.loadData = function () {
        var _this = this;
        console.log('loadData');
        this.webapiService.getCompanies().subscribe(function (companies) {
            console.log(companies);
            _this.Companies = companies;
        });
    };
    CompaniesComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-companies',
            template: __webpack_require__("./src/app/companies/companies.component.html"),
            styles: [__webpack_require__("./src/app/companies/companies.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CompaniesComponent);
    return CompaniesComponent;
}());



/***/ }),

/***/ "./src/app/company/company.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/company/company.component.html":
/***/ (function(module, exports) {

module.exports = "<form class=\"ui form\">\n  <h4 class=\"ui dividing header\"> read Company</h4>\n  <div class=\"field\">\n      <label>Company Name</label>\n      <div class=\"field\">\n          <input type=\"text\" name=\"title\"readonly=\"\" [(ngModel)]=\"this.company.compName\">\n      </div>\n  </div>\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"text\" name=\"password\"readonly=\"\" [(ngModel)]=\"this.company.password\">\n    </div>\n</div>\n<div class=\"field\">\n  <label>email</label>\n  <div class=\"field\">\n      <input type=\"email\"readonly=\"\" name=\"title\" [(ngModel)]=\"this.company.email\">\n  </div>\n</div>\n</form>"

/***/ }),

/***/ "./src/app/company/company.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CompanyComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CompanyComponent = (function () {
    function CompanyComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CompanyComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.webapiService.currentMessage.subscribe(function (company) {
            _this.webapiService.getCompanyById(company).subscribe(function (companyByID) {
                _this.company = companyByID;
                console.log('companyByID {}', companyByID);
            });
        });
    };
    CompanyComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-company',
            template: __webpack_require__("./src/app/company/company.component.html"),
            styles: [__webpack_require__("./src/app/company/company.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CompanyComponent);
    return CompanyComponent;
}());



/***/ }),

/***/ "./src/app/create-company/create-company.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/create-company/create-company.component.html":
/***/ (function(module, exports) {

module.exports = "<form class=\"ui form\">\n  <h4 class=\"ui dividing header\">Company</h4>\n  <div class=\"field\">\n      <label>Company Name</label>\n      <div class=\"field\">\n          <input type=\"text\" name=\"title\" [(ngModel)]=\"this.Company.compName\">\n      </div>\n  </div>\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"password\" name=\"title\" [(ngModel)]=\"this.Company.password\">\n    </div>\n</div>\n<div class=\"field\">\n  <label>email</label>\n  <div class=\"field\">\n      <input type=\"email\" name=\"title\" [(ngModel)]=\"this.Company.email\">\n  </div>\n</div>\n\n \n\n  <div class=\"ui button\" tabindex=\"0\" (click)=\"CreateCompany($event)\">Create</div>\n</form>"

/***/ }),

/***/ "./src/app/create-company/create-company.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateCompanyComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CreateCompanyComponent = (function () {
    function CreateCompanyComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CreateCompanyComponent.prototype.ngOnInit = function () {
        this.resetCompanyCoupon();
    };
    CreateCompanyComponent.prototype.CreateCompany = function () {
        this.webapiService.CreateCompany(this.Company).subscribe(function (res) {
            console.log(res);
        });
        this.resetCompanyCoupon();
    };
    CreateCompanyComponent.prototype.resetCompanyCoupon = function (form) {
        if (form != null)
            form.reset();
        this.Company = {
            compName: '',
            password: '',
            email: ''
        };
    };
    CreateCompanyComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-create-company',
            template: __webpack_require__("./src/app/create-company/create-company.component.html"),
            styles: [__webpack_require__("./src/app/create-company/create-company.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CreateCompanyComponent);
    return CreateCompanyComponent;
}());



/***/ }),

/***/ "./src/app/create-customer/create-customer.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/create-customer/create-customer.component.html":
/***/ (function(module, exports) {

module.exports = "<form class=\"ui form\">\n  <h4 class=\"ui dividing header\">Customer</h4>\n  <div class=\"field\">\n      <label>Customer Name</label>\n      <div class=\"field\">\n          <input type=\"text\" name=\"title\" [(ngModel)]=\"this.Customer.custName\">\n      </div>\n  </div>\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"password\" name=\"title\" [(ngModel)]=\"this.Customer.password\">\n    </div>\n</div>\n\n\n \n\n  <div class=\"ui button\" tabindex=\"0\" (click)=\"CreateCustomer($event)\">Create</div>\n</form>"

/***/ }),

/***/ "./src/app/create-customer/create-customer.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CreateCustomerComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CreateCustomerComponent = (function () {
    function CreateCustomerComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CreateCustomerComponent.prototype.ngOnInit = function () {
        this.resetCustomerCoupon();
    };
    CreateCustomerComponent.prototype.CreateCustomer = function () {
        this.webapiService.CreateCustomer(this.Customer).subscribe(function (res) {
            console.log(res);
        });
        this.resetCustomerCoupon();
    };
    CreateCustomerComponent.prototype.resetCustomerCoupon = function (form) {
        if (form != null)
            form.reset();
        this.Customer = {
            custName: '',
            password: ''
        };
    };
    CreateCustomerComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-create-customer',
            template: __webpack_require__("./src/app/create-customer/create-customer.component.html"),
            styles: [__webpack_require__("./src/app/create-customer/create-customer.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CreateCustomerComponent);
    return CreateCustomerComponent;
}());



/***/ }),

/***/ "./src/app/customer/customer.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/customer/customer.component.html":
/***/ (function(module, exports) {

module.exports = "\n<form class=\"ui form\">\n  <h4 class=\"ui dividing header\"> read customer</h4>\n  <div class=\"field\">\n      <label>customer Name</label>\n      <div class=\"field\">\n          <input type=\"text\" name=\"title\"readonly=\"\" [(ngModel)]=\"this.customer.custName\">\n      </div>\n  </div>\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"text\" name=\"password\"readonly=\"\" [(ngModel)]=\"this.customer.password\">\n    </div>\n</div>\n</form>"

/***/ }),

/***/ "./src/app/customer/customer.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CustomerComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CustomerComponent = (function () {
    function CustomerComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CustomerComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.webapiService.currentMessage.subscribe(function (customer) {
            _this.webapiService.getCustomerByID(customer).subscribe(function (customerByID) {
                _this.customer = customerByID;
                console.log('customerByID {}', customerByID);
            });
        });
    };
    CustomerComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-customer',
            template: __webpack_require__("./src/app/customer/customer.component.html"),
            styles: [__webpack_require__("./src/app/customer/customer.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CustomerComponent);
    return CustomerComponent;
}());



/***/ }),

/***/ "./src/app/customers/customers.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/customers/customers.component.html":
/***/ (function(module, exports) {

module.exports = "\n<h1>\n  Customers</h1>\n<div class=\"ui middle aligned divided list\">\n  <div class=\"item\" *ngFor=\"let customer of Customers\">\n    <div class=\"right floated content\">\n      <div class=\"ui button\" routerLink=\"../updateCustomer\"  (click)=\"UpdateButton($event,customer)\">Update</div>\n    </div>\n    <div class=\"right floated content\">\n      <div class=\"ui button\" (click)=\"RemoveButton($event,customer)\">Remove</div>\n    </div>\n    <div class=\"right floated content\">\n      <div class=\"ui button\" routerLink=\"../Customer\"  (click)=\"detailsButton($event,customer)\">details</div>\n    </div>\n    <div class=\"ui big horizontal divided list\">\n      <div class=\"item\">\n        <div class=\"content\">\n          <div class=\"header\"> {{customer.custName}}</div>\n        </div>\n      </div>\n      \n\n    </div>\n  </div>\n</div>\n"

/***/ }),

/***/ "./src/app/customers/customers.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return CustomersComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var CustomersComponent = (function () {
    function CustomersComponent(webapiService) {
        this.webapiService = webapiService;
    }
    CustomersComponent.prototype.ngOnInit = function () {
        this.loadData();
    };
    CustomersComponent.prototype.UpdateButton = function (event, customer) {
        console.log("UpdateButton " + event);
        this.webapiService.changeMessage(customer);
    };
    CustomersComponent.prototype.RemoveButton = function (event, customer) {
        console.log("RemoveButton " + event);
        this.webapiService.removeCustomer(customer).subscribe(function (res) {
        });
        this.loadData();
    };
    CustomersComponent.prototype.detailsButton = function (event, customer) {
        console.log("RemoveButton " + event);
        console.log("customer " + customer);
        this.webapiService.changeMessage(customer);
    };
    CustomersComponent.prototype.loadData = function () {
        var _this = this;
        console.log('loadData');
        this.webapiService.getCustomers().subscribe(function (customers) {
            console.log(customers);
            _this.Customers = customers;
        });
    };
    CustomersComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-customers',
            template: __webpack_require__("./src/app/customers/customers.component.html"),
            styles: [__webpack_require__("./src/app/customers/customers.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], CustomersComponent);
    return CustomersComponent;
}());



/***/ }),

/***/ "./src/app/footer/footer.component.css":
/***/ (function(module, exports) {

module.exports = ".footer {\r\n    padding: 10px;\r\n    text-align: center;\r\n    background: #124914;\r\n}"

/***/ }),

/***/ "./src/app/footer/footer.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"footer\">\n  <h2></h2>\n</div>"

/***/ }),

/***/ "./src/app/footer/footer.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return FooterComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var FooterComponent = (function () {
    function FooterComponent() {
    }
    FooterComponent.prototype.ngOnInit = function () {
    };
    FooterComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-footer',
            template: __webpack_require__("./src/app/footer/footer.component.html"),
            styles: [__webpack_require__("./src/app/footer/footer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], FooterComponent);
    return FooterComponent;
}());



/***/ }),

/***/ "./src/app/header/header.component.css":
/***/ (function(module, exports) {

module.exports = "/* Style the body */\r\nbody {\r\n    font-family: Arial;\r\n    margin: 0;\r\n}\r\n/* Header/logo Title */\r\n.header {\r\n    padding: 45px;\r\n    text-align: center;\r\n    background: #4CAF50;\r\n    color: white;\r\n}\r\n/* Increase the font size of the heading */\r\n.header h1 {\r\n    font-size: 35px;\r\n}\r\nimg.avatar {\r\n    width: 40%;\r\n\tborder-radius: 40%;\r\n}\r\n.imgcontainer {\r\n    text-align: center;\r\n    margin: 24px 0 12px 0;\r\n    position: relative;\r\n}"

/***/ }),

/***/ "./src/app/header/header.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"header\">\n    <div class=\"imgcontainer\">\n        <img src=\"../../assets/img_avatar2.png\" alt=\"Avatar\" class=\"avatar\">\n      </div>\n</div>"

/***/ }),

/***/ "./src/app/header/header.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HeaderComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var HeaderComponent = (function () {
    function HeaderComponent() {
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-header',
            template: __webpack_require__("./src/app/header/header.component.html"),
            styles: [__webpack_require__("./src/app/header/header.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/main/main.component.css":
/***/ (function(module, exports) {

module.exports = "/* .side {\r\n    -ms-flex: 30%; \r\n    flex: 30%;\r\n    background-color: #f1f1f1;\r\n    padding: 20px;\r\n}\r\n\r\n/* Main column */\r\n/* .main {   \r\n    -ms-flex: 70%;\r\n    flex: 70%;\r\n    background-color: white;\r\n    padding: 20px;\r\n} */ "

/***/ }),

/***/ "./src/app/main/main.component.html":
/***/ (function(module, exports) {

module.exports = "<h1>welcome to Coupn System</h1>"

/***/ }),

/***/ "./src/app/main/main.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MainComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var MainComponent = (function () {
    function MainComponent() {
    }
    MainComponent.prototype.ngOnInit = function () {
    };
    MainComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-main',
            template: __webpack_require__("./src/app/main/main.component.html"),
            styles: [__webpack_require__("./src/app/main/main.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], MainComponent);
    return MainComponent;
}());



/***/ }),

/***/ "./src/app/menu/menu.component.css":
/***/ (function(module, exports) {

module.exports = "/* .side {\r\n    -ms-flex: 30%; \r\n     flex: 30%;\r\n    background-color: #f1f1f1;\r\n    padding: 20px;\r\n} */\r\n\r\n/* Main column */\r\n\r\n/* .main {   \r\n    -ms-flex: 70%;\r\n    flex: 70%;\r\n    background-color: white;\r\n    padding: 20px;\r\n} */"

/***/ }),

/***/ "./src/app/menu/menu.component.html":
/***/ (function(module, exports) {

module.exports = "<div class=\"ui card\">\n    <div class=\"image\">\n      <img src=\"assets\\httpswww.iconfinder.comicons158-256.png\">\n    </div>\n    <div class=\"content\">\n      <span class=\"header\">welcome </span>\n      <div class=\"meta\">\n        <span class=\"date\">administrator</span>\n      </div>\n      <div class=\"description\">\n      </div>\n    </div>\n  </div>"

/***/ }),

/***/ "./src/app/menu/menu.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MenuComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var MenuComponent = (function () {
    function MenuComponent(webapiService) {
        this.webapiService = webapiService;
    }
    MenuComponent.prototype.ngOnInit = function () {
    };
    MenuComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-menu',
            template: __webpack_require__("./src/app/menu/menu.component.html"),
            styles: [__webpack_require__("./src/app/menu/menu.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], MenuComponent);
    return MenuComponent;
}());



/***/ }),

/***/ "./src/app/navbar/navbar.component.css":
/***/ (function(module, exports) {

module.exports = "/* Style the top navigation bar */\r\n.navbar {\r\n    overflow: hidden;\r\n    background-color: #124914;\r\n}\r\n/* Style the navigation bar links */\r\n.navbar a {\r\n    float: left;\r\n    display: block;\r\n    color: white;\r\n    text-align: center;\r\n    padding: 14px 20px;\r\n    text-decoration: none;\r\n}\r\n/* Right-aligned link */\r\n.navbar a.right {\r\n    float: right;\r\n}\r\n/* Change color on hover */\r\n.navbar a:hover {\r\n    background-color: #ddd;\r\n    color: black;\r\n}\r\n.navbar a.active {\r\n    background-color: #4caf50;\r\n    color: black;\r\n}"

/***/ }),

/***/ "./src/app/navbar/navbar.component.html":
/***/ (function(module, exports) {

module.exports = "\n<div class=\"navbar\">\n  <a routerLink=\"Administrator/createCompany\" routerLinkActive='active'>Create Company</a>\n  <a routerLink=\"Administrator/createCustomer\" routerLinkActive='active'>Create Customer</a>\n  <a routerLink=\"Administrator/Companies\" routerLinkActive='active'>Companies</a>\n  <a routerLink=\"Administrator/Customers\" routerLinkActive='active'>Customers</a>\n  <a href=\"#\" class=\"right\" (click)=\"logOut($event)\">log Out</a>\n</div>"

/***/ }),

/***/ "./src/app/navbar/navbar.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return NavbarComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var NavbarComponent = (function () {
    function NavbarComponent(webapiService) {
        this.webapiService = webapiService;
    }
    NavbarComponent.prototype.ngOnInit = function () {
    };
    NavbarComponent.prototype.logOut = function (event) {
        console.log("logOut " + event);
        this.webapiService.logout().subscribe(function (res) {
            console.log(res);
        });
    };
    NavbarComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-navbar',
            template: __webpack_require__("./src/app/navbar/navbar.component.html"),
            styles: [__webpack_require__("./src/app/navbar/navbar.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], NavbarComponent);
    return NavbarComponent;
}());



/***/ }),

/***/ "./src/app/routes.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return appRoutes; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__main_main_component__ = __webpack_require__("./src/app/main/main.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__create_company_create_company_component__ = __webpack_require__("./src/app/create-company/create-company.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__companies_companies_component__ = __webpack_require__("./src/app/companies/companies.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__create_customer_create_customer_component__ = __webpack_require__("./src/app/create-customer/create-customer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__customers_customers_component__ = __webpack_require__("./src/app/customers/customers.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__update_company_update_company_component__ = __webpack_require__("./src/app/update-company/update-company.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__company_company_component__ = __webpack_require__("./src/app/company/company.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__customer_customer_component__ = __webpack_require__("./src/app/customer/customer.component.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__update_customer_update_customer_component__ = __webpack_require__("./src/app/update-customer/update-customer.component.ts");









var appRoutes = [
    {
        path: 'Administrator',
        children: [
            {
                path: 'home',
                component: __WEBPACK_IMPORTED_MODULE_0__main_main_component__["a" /* MainComponent */]
            },
            {
                path: 'createCompany',
                component: __WEBPACK_IMPORTED_MODULE_1__create_company_create_company_component__["a" /* CreateCompanyComponent */]
            },
            {
                path: 'updateCompany',
                component: __WEBPACK_IMPORTED_MODULE_5__update_company_update_company_component__["a" /* UpdateCompanyComponent */]
            },
            {
                path: 'Company',
                component: __WEBPACK_IMPORTED_MODULE_6__company_company_component__["a" /* CompanyComponent */]
            },
            {
                path: 'Companies',
                component: __WEBPACK_IMPORTED_MODULE_2__companies_companies_component__["a" /* CompaniesComponent */]
            },
            {
                path: 'createCustomer',
                component: __WEBPACK_IMPORTED_MODULE_3__create_customer_create_customer_component__["a" /* CreateCustomerComponent */]
            },
            {
                path: 'updateCustomer',
                component: __WEBPACK_IMPORTED_MODULE_8__update_customer_update_customer_component__["a" /* UpdateCustomerComponent */]
            },
            {
                path: 'Customers',
                component: __WEBPACK_IMPORTED_MODULE_4__customers_customers_component__["a" /* CustomersComponent */]
            },
            {
                path: 'Customer',
                component: __WEBPACK_IMPORTED_MODULE_7__customer_customer_component__["a" /* CustomerComponent */]
            }
        ]
    }, {
        path: '', redirectTo: '/Administrator', pathMatch: 'full'
    }
];


/***/ }),

/***/ "./src/app/server/webapi.service.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WebapiService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_http__ = __webpack_require__("./node_modules/@angular/http/esm5/http.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_rxjs_add_operator_map__ = __webpack_require__("./node_modules/rxjs/_esm5/add/operator/map.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3_rxjs_BehaviorSubject__ = __webpack_require__("./node_modules/rxjs/_esm5/BehaviorSubject.js");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};




var WebapiService = (function () {
    function WebapiService(http) {
        this.http = http;
        this.rootUrl = 'http://localhost:8080/';
        this.messageSource = new __WEBPACK_IMPORTED_MODULE_3_rxjs_BehaviorSubject__["a" /* BehaviorSubject */]("null");
        this.currentMessage = this.messageSource.asObservable();
        console.log('webAPI run ....');
    }
    WebapiService.prototype.getcoupons = function () {
        return this.http.get(this.rootUrl + 'api/companyres/getcoupons').map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getCompany = function () {
        return this.http.get(this.rootUrl + 'api/companyres/Company').map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getMaxPriceFromCopany = function (MaxPrice) {
        return this.http.get(this.rootUrl + 'api/companyres/less?MaxPrice=' + MaxPrice).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getByEndDate = function (EndDate) {
        return this.http.get(this.rootUrl + 'api/companyresGet/?getCouponByEndDate=' + EndDate).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getByType = function (Type) {
        return this.http.get(this.rootUrl + 'api/companyres/?getCouponByType=' + Type).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.createCoupon = function (Coupon) {
        return this.http.post(this.rootUrl + 'api/companyres/createCoupon', Coupon).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.logout = function () {
        return this.http.post(this.rootUrl + 'api/logout', null).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.removeCoupoun = function (Coupon) {
        return this.http.post(this.rootUrl + 'api/companyres/removeCoupoun', Coupon).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.updateCoupon = function (Coupon) {
        return this.http.put(this.rootUrl + 'api/companyres/updateCoupon', Coupon).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.CreateCompany = function (Company) {
        return this.http.post(this.rootUrl + 'api/administratorRes/createCompany', Company).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.CreateCustomer = function (Customer) {
        return this.http.post(this.rootUrl + 'api/administratorRes/createCustomrer', Customer).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getCompanies = function () {
        return this.http.get(this.rootUrl + 'api/administratorRes/getAllCompanys').map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getCustomers = function () {
        return this.http.get(this.rootUrl + 'api/administratorRes/getAllCustomrers').map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getCompanyById = function (Id) {
        return this.http.get(this.rootUrl + 'api/administratorRes/Company?companyId=' + Id.id).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.getCustomerByID = function (Id) {
        return this.http.get(this.rootUrl + 'api/administratorRes/Customrer?customrerId=' + Id.id).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.removeCompany = function (Company) {
        return this.http.post(this.rootUrl + 'api/administratorRes/removeCompany', Company).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.removeCustomer = function (Customer) {
        return this.http.post(this.rootUrl + 'api/administratorRes/removeCustomrer', Customer).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.updateCompany = function (Company) {
        return this.http.put(this.rootUrl + 'api/administratorRes/updateCompany', Company).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.updateCustomer = function (Customer) {
        return this.http.put(this.rootUrl + 'api/administratorRes/updateCustomrer', Customer).map(function (res) { return res.json(); });
    };
    WebapiService.prototype.changeMessage = function (message) {
        this.messageSource.next(message);
    };
    WebapiService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_http__["a" /* Http */]])
    ], WebapiService);
    return WebapiService;
}());



/***/ }),

/***/ "./src/app/update-company/update-company.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/update-company/update-company.component.html":
/***/ (function(module, exports) {

module.exports = "<form class=\"ui form\">\n  <h4 class=\"ui dividing header\">Update Company</h4>\n  <!-- <div class=\"field\">\n      <label>Company Name</label>\n      <div class=\"field\">\n          <input type=\"text\" name=\"title\" [(ngModel)]=\"this.company.compName\">\n      </div>\n  </div> -->\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"text\" name=\"password\" [(ngModel)]=\"this.company.password\">\n    </div>\n</div>\n<div class=\"field\">\n  <label>email</label>\n  <div class=\"field\">\n      <input type=\"email\" name=\"title\" [(ngModel)]=\"this.company.email\">\n  </div>\n</div>\n  <div class=\"ui button\" tabindex=\"0\" (click)=\"UpdateButton($event)\">Update</div>\n</form>"

/***/ }),

/***/ "./src/app/update-company/update-company.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return UpdateCompanyComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var UpdateCompanyComponent = (function () {
    function UpdateCompanyComponent(webapiService) {
        this.webapiService = webapiService;
    }
    UpdateCompanyComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.webapiService.currentMessage.subscribe(function (company) { return _this.company = company; });
        console.log("company Update");
        console.log(this.company);
    };
    UpdateCompanyComponent.prototype.UpdateButton = function () {
        var _this = this;
        console.log("UpdateButton");
        console.log(this.company);
        this.webapiService.updateCompany(this.company).subscribe(function (company) {
            console.log(_this.company);
        });
    };
    UpdateCompanyComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-update-company',
            template: __webpack_require__("./src/app/update-company/update-company.component.html"),
            styles: [__webpack_require__("./src/app/update-company/update-company.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], UpdateCompanyComponent);
    return UpdateCompanyComponent;
}());



/***/ }),

/***/ "./src/app/update-customer/update-customer.component.css":
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/update-customer/update-customer.component.html":
/***/ (function(module, exports) {

module.exports = "\n<form class=\"ui form\">\n  <h4 class=\"ui dividing header\">Update Customer</h4>\n\n  <div class=\"field\">\n    <label>password</label>\n    <div class=\"field\">\n        <input type=\"text\" name=\"password\" [(ngModel)]=\"this.customer.password\">\n    </div>\n</div>\n  <div class=\"ui button\" tabindex=\"0\" (click)=\"UpdateButton($event)\">Update</div>\n</form>"

/***/ }),

/***/ "./src/app/update-customer/update-customer.component.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return UpdateCustomerComponent; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__server_webapi_service__ = __webpack_require__("./src/app/server/webapi.service.ts");
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var UpdateCustomerComponent = (function () {
    function UpdateCustomerComponent(webapiService) {
        this.webapiService = webapiService;
    }
    UpdateCustomerComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.webapiService.currentMessage.subscribe(function (customer) { return _this.customer = customer; });
        console.log("customer Update");
        console.log(this.customer);
    };
    UpdateCustomerComponent.prototype.UpdateButton = function () {
        var _this = this;
        console.log("UpdateButton");
        console.log(this.customer);
        this.webapiService.updateCustomer(this.customer).subscribe(function (customer) {
            console.log(_this.customer);
        });
    };
    UpdateCustomerComponent = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["n" /* Component */])({
            selector: 'app-update-customer',
            template: __webpack_require__("./src/app/update-customer/update-customer.component.html"),
            styles: [__webpack_require__("./src/app/update-customer/update-customer.component.css")]
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__server_webapi_service__["a" /* WebapiService */]])
    ], UpdateCustomerComponent);
    return UpdateCustomerComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return environment; });
// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.
var environment = {
    production: false
};


/***/ }),

/***/ "./src/main.ts":
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__("./node_modules/@angular/core/esm5/core.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__ = __webpack_require__("./node_modules/@angular/platform-browser-dynamic/esm5/platform-browser-dynamic.js");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__app_app_module__ = __webpack_require__("./src/app/app.module.ts");
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__environments_environment__ = __webpack_require__("./src/environments/environment.ts");




if (__WEBPACK_IMPORTED_MODULE_3__environments_environment__["a" /* environment */].production) {
    Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["_13" /* enableProdMode */])();
}
Object(__WEBPACK_IMPORTED_MODULE_1__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_2__app_app_module__["a" /* AppModule */])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("./src/main.ts");


/***/ })

},[0]);
//# sourceMappingURL=main.bundle.js.map