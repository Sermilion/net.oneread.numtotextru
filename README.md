# net.oneread.numtotextru
This is a small library that will translate integer numbers into its string representation in Russian language, and back.

To use simply copy the .arr file into lib folder and include:

```
allprojects { 
	repositories { 
		jcenter() 
		flatDir { 
			dirs 'libs' 
		} 
	}
}
```

and 

````compile(name:'net.oneread.surfstudio.test.numtotext', ext:'aar')````

to you build.gradle file.


Для использования библиотеки, скопируйте `.arr` или `.jar` файл в `.libs` добавтьте следующие сроки в `build.gradle`
```
allprojects { 
	repositories { 
		jcenter() 
		flatDir { 
			dirs 'libs' 
		} 
	}
}
```
и 
`compile(name:'net.oneread.surfstudio.test.numtotext', ext:'aar')`
