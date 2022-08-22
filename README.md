
# Rapport

**
This litle explanation about my project. This page is about car information, what brand is the location and how much does it cost?.


```
public void showExternalWebPage(int index){
        webView.loadUrl(cars[index].getAuxdata().getImg());
    }
    public void showInternalWebPage(){

    }
        
```

This is how i im loading the pictures cars on the webview I know the images are too big but if you touch the images between top and bottom you can see it.

```
 if (id == R.id.action_external_web) {
            Intent intent = new Intent(String.valueOf(MainActivity.class));

            return true;
        }

        if (id == R.id.action_internal_web) {
            Log.d("==>","Will display internal web page");
            Intent intent = new Intent(MainActivity.this, SegondActivity.class);
            startActivity(intent);
            return true;
        }
```
This is how i interact between pages. The main page to about pages

```
 cars = gson.fromJson(json,Cars[].class);

        ArrayAdapter<Cars> arrayAdapter = new ArrayAdapter<>(this, R.layout.listview_item, R.id.item, cars);
        ListView listView = findViewById(R.id.list_wiew);
        listView.setAdapter(arrayAdapter);
```

This is how my i addapt my arrays to listview to webview

**

_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.



Bilder läggs i samma mapp som markdown-filen.

![](car.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
