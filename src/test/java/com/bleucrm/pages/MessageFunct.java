package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MessageFunct extends BasePage{

    @FindBy(css = "span[class='feed-add-post-form-link feed-add-post-form-link-active']")
    public WebElement messageBut;

    @FindBy(css = "a[class='feed-add-destination-link']")
    public WebElement addMore;

    @FindBy(css = "a[class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement empDep;

    @FindBy(xpath = "//*[@id=\"bx-lm-box-last-content\"]/table/tr/td/div[3]/div[2]/div[1]/a/div[1]")
    public WebElement hr;

    //@FindBy(className=("bx-finder-company-department-check-arrow"))



    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement comma;

    @FindBy(css=".bxhtmled-top-bar-btn.bxhtmled-button-quote")
    public WebElement quote;

    @FindBy(xpath= "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement addMention;

    @FindBy(css="div[class='bx-finder-box-item-t7-name']")
    public WebElement Mention;

    @FindBy(xpath="//*[@id=\"bxid325151393\"]")
    public WebElement addedMention;

    @FindBy(css="body[contenteditable='true']")
    public WebElement messageBox;

    @FindBy(xpath="//*[@id=\"blog-submit-button-save\"]")
    public WebElement sendBtn;

    @FindBy(xpath="//*[@id=\"blg-post-img-433\"]")
    public WebElement messageDsp;


}
