package Observer;

import java.util.ArrayList;
import Observer.Observer;

public class DadosDoTempo implements Subject {

    public ArrayList<Observer> observers;

    public float temperatura;
    public float umidade;
    public float pressao;

    public DadosDoTempo(){
        observers = new ArrayList<>();
    }


    public void registraObservador(Observer o) {
        observers.add(o);
    }

    public void removeObservadores(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notificarObservadores() {
        for(int i = 0; i<observers.size();i++){
            Observer observador = (Observer) observers.get(i);
            observador.atualizar(temperatura,umidade,pressao);
        }
    }

    public void medicoeAlteradas(){
        notificarObservadores();
    }

    public void setMedicoes(float temperatura, float umidade, float pressao){
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
        medicoeAlteradas();
    }

}
