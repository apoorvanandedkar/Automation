const { browser, element } = require("protractor")

var Base = function()
{

    var name = element(by.name("name"));
    var email = element(by.name('email'));
    var pwd = element(by.id('exampleInputPassword1'));
    var btnSubmit = element(by.css('.btn-success'));
    

    this.enterName = function()
    {
        name.sendKeys('Apn');
    }

    this.enterEmail = function()
    {
        email.sendKeys('a@a.com');
    }

    this.enterPWD = function()
    {
        pwd.sendKeys('1234');
    }

    this.clickSubmit = function()
    {
        btnSubmit.click();
    }

    this.get = function(url)
    {
        browser.get(url)
    }
}

module.exports = new Base();