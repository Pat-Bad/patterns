package org.example.adapter;

public class UserData implements DataSource {
    private String nomeCompleto;
    private int eta;

   public void getData(DataSource ds){
       nomeCompleto = ds.getNomeCompleto();
       eta = ds.getEta();
   }

    @Override
    public String getNomeCompleto() {
        return "";
    }

    @Override
    public int getEta() {
        return 0;
    }
}