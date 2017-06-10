package una.ac.cr.spaceinvaders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by Jordy on 27/5/2017.
 */

public class NaveView extends View{

    Coordenada coordenada;
    Coordenada maxCoordenada;

    public NaveView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.nave2);
        canvas.drawBitmap(bitmap,0,0,new Paint());
        this.setX(coordenada.getX());
        this.setY(coordenada.getY());
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public Coordenada getMaxCoordenada() {
        return maxCoordenada;
    }

    public void setMaxCoordenada(Coordenada maxCoordenada) {
        this.maxCoordenada = maxCoordenada;
    }

}
