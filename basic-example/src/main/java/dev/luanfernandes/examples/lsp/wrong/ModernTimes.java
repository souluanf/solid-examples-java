package dev.luanfernandes.examples.lsp.wrong;


public class ModernTimes extends Movie {
    @Override
    public void increaseVolume() {
        super.increaseVolume();
        //Dará erro. Parece Movie,m as não é.
    }
}
