package by.lab.builder;

import by.lab.exception.RepositoryException;
import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
