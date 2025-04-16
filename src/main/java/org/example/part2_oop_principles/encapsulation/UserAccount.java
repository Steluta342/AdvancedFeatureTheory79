package org.example.part2_oop_principles.encapsulation;

/*
Definitie: Incapsularea -> inseamna (creaza o modalitate de) ascunderea detaliilor interne ale unui obiect
 si oferirea unor metode publice prin care utilizatorii pot intractiona
 cu datele clasei intr-un mod controlat.
 Dependinta ajutatoare: Lombok -putem sa cream la nivel de adnotatie structuri de cod nealterate/standard
 de getters/setters, constructori neparametrizati/parametrizati, metode suprascrise

 */


public class UserAccount {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && username.length() >= 5) {
            this.username = username;
        } else {
            throw new IllegalArgumentException("Ar trebuis sa aiba 5  caractere!");
        }
    }

    public void setPassword(String password) {

        //parolaA123, 123ABC - sunt parole ok pt ca au si litere mari
        //parola123, xyz, nu sunt parole ok
        // REGEX .*[A-Z].* -> verifica daca avem litere mari in structura stringului

        if (password.matches(".*[A-Z].*") && password.length() >= 8) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Parola este prea slaba!");
        }
    }
}



