Calculator.java - LOC: 188
Start.java - LOC: 26
LOC Total: 188 + 26 = 214

Complexitate ciclomatica: 
	evaluateExpression() - 6
	Calculate() - 8
Complexitate cognitiva:
	evaluateExpression() - 9
	Calculate() - 11
 
Analiza statica

Calculator.java - 1 - Codul nu este inclus intr-un pachet (i.e. Named Package), asa ca a fost introdus in pachetul default. Ar trebui creat un Named Package pentru un management mai bun al aplicatiei. 
Calculator.java - 4 - Ar trebui creat un constructor privat in locul celui public care a fost generat implicit.
Calculator.java - 18 - metoda ToString are 2 probleme de denumire. Prima este ca nu respecta conventia de denumire si ar trebui redenumita sa inceapa cu litera mica: toString. Rezolvand prima problema o identificam pe a doua -  trebui redenumita pentru a evita confuzia cu metoda "toString" definita in superclasa "java.lang.Object" 
Calculator.java - 24 - metoda "Run" ar trebui redenumita ca sa pastreze conventia de denumire in "run"
Calculator.java - 70 - ar trebui returnata direct expresia "Float.toString(finalResult)" in loc sa fie atribuita unei variabile, care sa fie returnata ulterior.
Calculator.java - 74 - metoda "Calculate" ar trebui redenumita ca sa pastreze conventia de denumire in "calculate"
Calculator.java - 183 - nu este necesar acest "return"

Start.java - 1 - Codul nu este inclus intr-un pachet (i.e. Named Package), asa ca a fost introdus in pachetul default. Ar trebui creat un Named Package pentru un management mai bun al aplicatiei. 
Start.java - 6 - Variabila locala "Expression" trebuie redenumita pentru a respecta conventia de denumire in "expression"
Start.java - 8 - Afisarea la consola ar trebui inlocuita cu folosirea unui framework pentru logarea datelor.
Start.java - 19 - Afisarea la consola ar trebui inlocuita cu folosirea unui framework pentru logarea datelor.
