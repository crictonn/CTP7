package by.lab.builder;

import by.lab.exception.RepositoryException;
import by.lab.model.User;
import by.lab.repository.dbconstants.UserTableConstants;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserBuilder implements Builder<User> {
    @Override
    public User build(ResultSet resultSet) throws RepositoryException {
        try {
            int id = resultSet.getInt(UserTableConstants.ID.getFieldName());
            String login =
                    resultSet.getString(UserTableConstants.LOGIN.getFieldName());
            byte[] password =
                    resultSet.getBytes(UserTableConstants.PASSWORD.getFieldName());
            return new User(login, password);
        } catch (SQLException exception) {
            throw new RepositoryException(exception.getMessage(), exception);
        }
    }
}

