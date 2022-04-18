
# Rapport
- Det första jag gjorde var att infoga ett logcat-meddelande i onCreate för att testa att allt fungerar som det skall
- Sedan modifierade jag den redan existerande TextView genom att positionera rätt, ändra färg, storlek och tillfoga en marginBottom
- Sedan infogade jag dom två olika kombinationerna av TextView samt EditText för användarenamn samt lösenord, dessa är väldigt identiska förutom positioneringen och ser ut som följande:

```
 <TextView
        android:id="@+id/username_text"
        android:textColor="@color/textDark"
        android:textSize="15sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/username_message"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@id/login_message"
        android:layout_marginTop="50dp" />

    <EditText
        android:id="@+id/username_input"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:inputType="textPersonName"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@id/username_text" />
```        

- Sedan så insåg jag ett misstag i min EditText för lösenordet att man kan vid inmatningen av lösenordet se detta, hittade en lösning i formen av inputType = textPassword

```
        android:inputType="textPassword"
```

- Jag tog även möjligheten att modifiera hexkoderna till färgerna inom colors.xml samt lade till två stycken för texterna för vidare lärdom, sedan använde jag mig av dessa för att färglägga dom redan existerande elementen.

```
<resources>
    <color name="colorPrimary">#558b2f</color>
    <color name="colorPrimaryDark">#255d00</color>
    <color name="colorAccent">#85bb5c</color>
    <color name="textLight">#FFFFFF</color>
    <color name="textDark">#000000</color>
</resources>
```

- Sedan tog jag och infogade två olika knappar, för att representera vanligt förekommande alternativ idag med inloggning genom andra konton, i detta fall facebook samt google.

```
<Button
    android:id="@+id/facebook_button"
    android:width="200dp"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:backgroundTint="@color/colorAccent"
    android:text="@string/facebook_button"
    app:layout_constraintRight_toRightOf="parent"
    app:layout_constraintLeft_toLeftOf="parent"
    app:layout_constraintTop_toBottomOf="@id/password_input"
    android:layout_marginTop="40dp" />
```

- Jag valde även att använda mig av en ImageView, därmed importerade jag en bild från unsplashed som är licensfri, länk till bilden finns här: https://unsplash.com/photos/P_SSMIgqjY0
- Denna importerade jag som en ImageAsset i res och använde i min ImageView som src

```
<ImageView
    android:id="@+id/imageView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@mipmap/goat_image"
    android:minWidth="200dp"
    android:minHeight="200dp"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintBottom_toTopOf="@id/login_message"
    android:layout_marginBottom="20dp" />
```

- Jag valde även att rengöra lite misstag, som att infoga textmeddelanderna som återfanns inom activity_main till strings inom strings.xml, exempelvis "Login" och "Username"
- En annan varning som dök upp var att jag använde mig av "dp" istället för "sp" för fontstorlekarna, detta korrigerade jag även vid detta steg

- Slutligen så infogade jag onClick-funktioner för min "login with facebook" samt "login with google" knapp, för att se att dessa registerades korrekt för framtida experiment med dessa knappar

```
facebookButton = findViewById(R.id.facebook_button);
facebookButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.d("==>", "facebookButton pressed.");
    }
});

googleButton = findViewById(R.id.google_button);
googleButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.d("==>", "googleButton pressed.");
    }
});
```        

- Efter detta lade jag endast in grade-funktionen samt tog en skärmdump på min prototyp av en login-sida för duggan Layouts & Views!


![](android.png)

