package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.MessageFunct;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class MessageFunctionality {
    MessageFunct messageFunct=new MessageFunct();

    @When("User navigates to Message Tag")
    public void user_navigates_to_Message_Tag() {

        messageFunct.messageBut.click();
    }

    @When("User clicks on the To box")
    public void user_clicks_on_the_To_box() throws InterruptedException {
        Thread.sleep(2000);

        messageFunct.addMore.click();
    }

    @When("User selects Employees and Departments")
    public void user_selects_Employees_and_Departments() throws InterruptedException {
        Thread.sleep(2000);
        messageFunct.empDep.click();
    }

    @Then("User should see the selected users on TO box")
    public void user_should_see_the_selected_users_on_TO_box() {
      //  messageFunct.hr.click();
        List<WebElement> emps=Driver.get().findElements(By.className("bx-finder-company-department-text"));
        for (WebElement emp:emps){
            if (!emp.getText().contains("Cyber Vet")){
                emp.click();
            }
        }

        List<WebElement> departments=Driver.get().findElements(By.className("bx-finder-company-department-check-arrow"));
            for(WebElement deps:departments){
                deps.click();
                System.out.println(deps.getText());
            }
        List<WebElement> newField= Driver.get().findElements(By.className("feed-add-post-destination-text")) ;
       for (WebElement feed:newField){
           Assert.assertTrue(feed.isDisplayed());
       }
//            Assert.assertTrue(messageFunct.checkBox.isSelected());
//

        }



    @When("User clicks on the {string} icon")
    public void user_clicks_on_the_icon(String str) {
        Assert.assertTrue(messageFunct.comma.isDisplayed());
        messageFunct.comma.click();

    }

    @When("User enters a quote")
    public void user_enters_a_quote() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(messageFunct.quote.isDisplayed());

    }

    @Then("User should see the quote on the writting pad")
    public void user_should_see_the_quote_on_the_writting_pad() {
Assert.assertTrue(messageFunct.quote.isDisplayed());

    }
    @When("User is able to click  on the {string} icon")
    public void user_is_able_to_click_on_the_icon(String string) {
        messageFunct.addMention.click();
    }

        @When("User enters a mention")
    public void user_enters_a_mention() {
            messageFunct.Mention.click();

    }

    @Then("User should see the mention on the writting pad")
    public void user_should_see_the_mention_on_the_writting_pad() {
Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));
       ;
Assert.assertTrue(messageFunct.messageBox.getText().contains("hr2@cybertekschool.com"));

    }

    @When("user enters a message")
    public void user_enters_a_message() {
        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));


        messageFunct.messageBox.sendKeys("Peace for Ukraina!!!");



    }

    @When("User clicks on the send button")
    public void user_clicks_on_the_send_button() {
        Driver.get().switchTo().frame(Driver.get().findElement(By.className("bx-editor-iframe")));


        messageFunct.sendBtn.click();
    }

    @Then("User should see the message on Activity Stream page")
    public void user_should_see_the_message_on_Activity_Stream_page() {

        Assert.assertTrue(messageFunct.messageDsp.isDisplayed());

    }


}
