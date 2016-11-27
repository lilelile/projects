package Film.dao;

import java.util.List;

public interface FilmDao {
	public int add(Object o);
	public int delete(int id);
	public int update(Object o);
	public List showAll();
}
