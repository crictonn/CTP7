package by.lab.command.grouppersons;

import by.lab.command.Command;
import by.lab.command.CommandResult;
import by.lab.exception.IncorrectDataException;
import by.lab.exception.ServiceException;
import by.lab.model.Person;
import by.lab.service.PersonService;
import by.lab.util.pages.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.lab.command.grouppersons.constant.GroupConstant.*;

import java.util.List;

public class WelcomeCommand implements Command {
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        PersonService personService = new PersonService();
        List<Person> clients = personService.findAll();
        if (!clients.isEmpty()) {
            request.setAttribute(LISTGROUP, clients);
        }
        return new CommandResult(Page.WELCOME_PAGE.getPage(), false);
    }
}
