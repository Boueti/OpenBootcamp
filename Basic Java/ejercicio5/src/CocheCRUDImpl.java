import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Guardando coche");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("Listando coches");
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Borrando coche");
    }
}
