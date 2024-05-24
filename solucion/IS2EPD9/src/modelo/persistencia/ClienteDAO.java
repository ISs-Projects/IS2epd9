package modelo.persistencia;

import java.util.List;
import modelo.entidades.Cliente;

/**
 *
 * @author IS2: Norberto Díaz-Díaz
 */
public interface ClienteDAO {
    public Cliente read(String pk);
    public void create(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    public List <Cliente> list();
}
