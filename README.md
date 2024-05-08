# DIO Lab POO iPhone

## Desafio
O desafio proposto se encontra no seguinte link: <a href="https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo" target="_blank">digitalinnovationone/trilha-java-basico</a>

### Diagrama de Classes

```mermaid
classDiagram

  class Music {
				+title : String
				+artist : String
				+album : String
				+duration : Integer
		}
	  class MusicPlayer {
			  <<interface>>
	      +play() void
	      +pause() vod
	      +selectMusic(music : Music) void
	  }
	  class TelephoneDevice {
			  <<interface>>
	      +call(number : String) void
	      +answer() void
	      +startVoiceMail() void
	  }
	  class InternetBrowser {
			  <<interface>>
	      +displayPage(url : String) void
	      +addNewTab(url : String) void
	      +refreshPage() void
	  }
	  
	  IPod --|> MusicPlayer
	  IPod "1" o-- "*" Music
	  
	  Phone --|> TelephoneDevice
	  Safari --|> InternetBrowser
	  
	  IPhone "1" *-- "1" IPod
	  IPhone "1" *-- "1" Phone
	  IPhone "1" *-- "1" Safari
```
