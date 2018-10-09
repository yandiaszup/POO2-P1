package Observer;

public interface Subject {
    void registraObservador(Observer o);
    void removeObservadores(Observer o);
    void notificarObservadores();
}
