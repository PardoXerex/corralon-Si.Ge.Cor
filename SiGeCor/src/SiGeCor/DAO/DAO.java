
package SiGeCor.DAO;

import java.util.List;

public interface DAO<T,k> {
    
    void insertar(T k) throws DAOException;
    void eliminar(T k) throws DAOException;
    void modificar(T k) throws DAOException;
    List<T> obtenerTodos() throws DAOException;
    T obtener(k id) throws DAOException;
}
