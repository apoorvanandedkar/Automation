const { browser } = require("protractor");
const Base = require("../PO/Base");

describe("DemoTests", function()
{
    beforeEach(function() 
    {
        Base.get("https://rahulshettyacademy.com/angularpractice/")
    })
    it("AddNumbers", function()
    {
        console.log("This is Spec")
        Base.enterName();
        browser.sleep(2000);
        Base.enterEmail();
        Base.enterPWD
        browser.sleep(2000);
        Base.clickSubmit();


    });   
});