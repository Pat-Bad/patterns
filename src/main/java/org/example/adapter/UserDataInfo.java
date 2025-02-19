package org.example.adapter;

import java.util.Date;

public class UserDataInfo implements DataSource{
    private Info info;

    public UserDataInfo(Info info){
        this.info = info;
    }
    public String getNomeCompleto(){return info.getNome() + " " + info.getCognome();}

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        long diffInMillis = new Date().getTime() - dataDiNascita.getTime();
        long diffInYears = diffInMillis / (1000L * 60 * 60 * 24 * 365);
        return (int) diffInYears;
    }
    }

