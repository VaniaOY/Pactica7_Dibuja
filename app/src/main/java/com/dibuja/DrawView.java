package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	  /* //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.RED);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.CYAN);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		

		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);
*/
        //.drawText(text, x, y, paint)
        paint.setTextSize(20);
        canvas.drawText("Practica 7 Dibujando Figuras", 450, 30, paint);
        canvas.drawText("Vania Alice Ortiz Yescas", 450, 55, paint);

        //octagono
		paint.setColor(Color.GREEN);
        Path octagono = new Path();
		float[] puntos = new float[16];
        puntos[0] = (float) 200+160;
        puntos[1] = (float) 200+80;
		puntos[2] = (float) 200+80;
        puntos[3] = (float) 200+160;
		puntos[4] = (float) 200-80;
        puntos[5] = (float) 200+160;
		puntos[6] = (float) 200-160;
        puntos[7] = (float) 200+80;
		puntos[8] = (float) 200-160;
        puntos[9] = (float) 200-80;
		puntos[10] = (float) 200-80;
        puntos[11] = (float) 200-160;
		puntos[12] = (float) 200+80;
        puntos[13] = (float) 200-160;
        puntos[14] = (float) 200+160;
        puntos[15] = (float) 200-80;

        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(4);
        canvas.drawLine(puntos[0], puntos[1], puntos[2], puntos[3], paint);
        canvas.drawLine(puntos[2], puntos[3], puntos[4], puntos[5], paint);
        canvas.drawLine(puntos[4], puntos[5], puntos[6], puntos[7], paint);
        canvas.drawLine(puntos[6], puntos[7], puntos[8], puntos[9], paint);
        canvas.drawLine(puntos[8], puntos[9], puntos[10], puntos[11], paint);
        canvas.drawLine(puntos[10], puntos[11], puntos[12], puntos[13], paint);
        canvas.drawLine(puntos[12], puntos[13], puntos[14], puntos[15], paint);
        canvas.drawLine(puntos[14], puntos[15], puntos[0], puntos[1], paint);

        paint.reset();
        //estrella
        paint.setColor(Color.GREEN);
        float[] punto = new float[20];
        punto[0] = (float) 1200-80;
        punto[1] = (float) 430-40;
        punto[2] = (float) 1200-120;
        punto[3] = (float) 430-160;
        punto[4] = (float) 1200-40;
        punto[5] = (float) 430-230;
        punto[6] = (float) 1200-160;
        punto[7] = (float) 430-240;
        punto[8] = (float) 1200-200;
        punto[9] = (float) 430-350;
        punto[10] = (float) 1200-240;
        punto[11] = (float) 430-240;
        punto[12] = (float) 1200-380;
        punto[13] = (float) 430-230;
        punto[14] = (float) 1200-280;
        punto[15] = (float) 430-160;
        punto[16] = (float) 1200-320;
        punto[17] = (float) 430-40;
        punto[18] = (float) 1200-200;
        punto[19] = (float) 430-120;

        paint.setStrokeWidth(3);
        canvas.drawLine(punto[0], punto[1], punto[2], punto[3], paint);
        canvas.drawLine(punto[2], punto[3], punto[4], punto[5], paint);
        canvas.drawLine(punto[4], punto[5], punto[6], punto[7], paint);
        canvas.drawLine(punto[6], punto[7], punto[8], punto[9], paint);
        canvas.drawLine(punto[8], punto[9], punto[10], punto[11], paint);
        canvas.drawLine(punto[10], punto[11], punto[12], punto[13], paint);
        canvas.drawLine(punto[12], punto[13], punto[14], punto[15], paint);
        canvas.drawLine(punto[14],   punto[15], punto[16], punto[17], paint);
        canvas.drawLine(punto[16], punto[17], punto[18], punto[19], paint);
        canvas.drawLine(punto[18], punto[19], punto[0], punto[1], paint);

    }

}

