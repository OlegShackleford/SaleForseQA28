package pages;

import dto.Contact;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.Picklist;

@Log4j2
public class ContactsModalPage extends BasePage{

    private String CONTACTS_PAGE_LINK = "https://tms9-dev-ed.develop." +
            "lightning.force.com/lightning/o/Contact/pipelineInspection?filterName=00BWU00000Gou2b2AB";
    public By BUTTON_NEW = By.xpath("//button[@name = 'NewContact']");

    public ContactsModalPage(WebDriver driver) {
        super(driver);
    }

    public void createNewContact(Contact contact){
        log.info("Create new contact into modal page");
        new Input(driver,"Phone").write(contact.getPhone());
        new Input(driver,"Home Phone").write(contact.getHomePhone());
        new Picklist(driver,"Salutation").select(contact.getSalutation());
        new Input(driver,"First Name").write(contact.getFirstName());
        new Input(driver,"Last Name").write(contact.getLastName());
        new Input(driver,"Mobile").write(contact.getMobile());
        new Input(driver,"Title").write(contact.getTitle());
        new Input(driver,"Other Phone").write(contact.getOtherPhone());
        new Input(driver,"Department").write(contact.getDepartment());
        new Input(driver,"Fax").write(contact.getFax());
        new Input(driver,"Email").write(contact.getEmail());
    }

    @Override
    public BasePage isPageOpened() {
        return null;
    }

    @Override
    public ContactsModalPage open() {
        driver.get(CONTACTS_PAGE_LINK);
        return this;
    }
}
