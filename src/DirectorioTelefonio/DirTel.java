package DirectorioTelefonio;

import java.util.*;

public class DirTel {

    HashMap<Integer, Cliente> listaClientes;

    public DirTel() {
        listaClientes = new HashMap<>();
    }

    //Registra un nuevo cliente con su nro de teléfono, siendo el nro del teléfono la clave.
    public void agregarCliente(Cliente c, int nroTel) {
        listaClientes.put(nroTel, c);
    }

    //Con el nro de teléfono retorna el Cliente asociado.
    public Cliente buscarCliente(int nroTel) {
        return listaClientes.get(nroTel);
    }

    //Con el apellido retorna una Lista con los nros de teléfono asociados.
    public List<Integer> buscarTeléfono(String apellido) {
        ArrayList<Integer> telefonos = new ArrayList();
        Iterator<Integer> it = listaClientes.keySet().iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (listaClientes.get(x).getApellido().equals(apellido)) {
                telefonos.add(listaClientes.hashCode());
            }
        }
        return telefonos;
    }

    //Con la ciudad retorna una Lista con los Clientes asociados.
    public List<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> clientes = new ArrayList();
        Iterator<Integer> it = listaClientes.keySet().iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (listaClientes.get(x).getCiudad().equals(ciudad)) {
                clientes.add(listaClientes.get(x));
            }
        }
        return clientes;
    }

    //Con el dni elimina el cliente del directorio.
    public void borrarCliente(int dni) {
        Iterator<Integer> it = listaClientes.keySet().iterator();
        while (it.hasNext()) {
            Integer x = it.next();
            if (listaClientes.get(x).getDni().equals(dni)) {
                listaClientes.remove(x);
            }
        }
    }
}
