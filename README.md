# FragilitySentry

Fragility Sentry è un'applicativo progettato per valutare la fragilità dei casi di test end-to-end scritti con il framework Selenium.
Fornisce una metriche per migliorare la robustezza dei test, nonchè di tutte le istruzioni che lo compongono.

## Linee guida per l'installazione

1. Installa gli applicativi con i rispettivi file "docker-compose" da PowerShell gli applicativi di sample
2. Clona il repository
3. Configurare il chromedriver per essere eseguito nell'IDE utilizzato


##Input
1. Una directory contenente i casi di test scritti con Selenium IDE in ambiente JUnit.
2. Una directory contentente un file "Result.csv", in questo file, devono essere riportati, I nomi dei singoli casi di test è il successo o fallimento di quest'ultimo in base alla versione.
3. Nel main, andrà specificato il nome dell'applicativo che si sta andando a testare (Deve avere lo stesso nome delle directory)


##Output

1. Dentro il file "Result.csv"  sono riportati i risultati della metrica per ogni caso di test, oltre a riportare il valore restituito dal coefficiente di correlazione punto-biseriale della metrica per ogni esito del test.
2. Dentro alla directory "Scores" sono presenti dei file .csv, ognuno con il nome di un caso di test eseguito, questo file contiene i diversi punteggi ottenuti da ogni istruzione.
