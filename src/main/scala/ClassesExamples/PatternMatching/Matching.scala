package ClassesExamples.PatternMatching

object Matching {
  def main(args: Array[String]): Unit = {
    /*
      La función showNotification toma los parámetros del tipo abstracto Notification
    y lo empareja con el tipo de Notification.
    */

    def showNotification(notification: Notification): String = {
      notification match {
        //Distingo si el objeto que ejecuta showNotification es uno de los casos y lo ejecuta
        case Email(sender, title, _) =>
          s"Tienes un Email de $sender con el título $title"  //Los valores de sender y title son tomados, pero el body se ignora con _

        case SMS(caller, message) =>
          s"Tienes un SMS de $caller, Mensaje: $message"

        case VoiceRecording(contactName, link) =>
          s"Recibiste una mensaje de voz de $contactName, Has Click aquí $link"
      }
    }

    val someSms = SMS("123-4567", "Estas ahi?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    val someEmail = Email("RobertoCarlos@gmail.com", "Hola", "Te escribia para saludar")

    println(showNotification(someSms))
    println(showNotification(someVoiceRecording))
    println(showNotification(someEmail))
    println("-------------------------------------------------------------------------------------------------")

    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
      notification match {
        //Comparo los casos para ver si cumplen con las especificaciones
        case Email(sender, _, _) if importantPeopleInfo.contains(sender) =>
          "Tienes un Email de una persona importante!"
        case SMS(caller, _) if importantPeopleInfo.contains(caller) =>
          "Tienes un SMS de una persona importante!"
        case other =>
          showNotification(other) // Ninguno de los casos anteriores se cumplio, entonces delego a que se cumpla la función definida anteriormente
      }
    }

    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")

    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")

    //Mensajes normales que no cumplen con los casos dados en la funcion showImportantNotification
    println(showImportantNotification(someSms, importantPeopleInfo)) // Muestra Tienes un SMS de 123-4567, Mensaje: Estas ahi?
    println(showImportantNotification(someVoiceRecording, importantPeopleInfo)) // Muestra Recibiste una mensaje de voz de Tom, Has Click aquí voicerecording.org/id/123

    println(showImportantNotification(importantEmail, importantPeopleInfo)) // Muestra Tienes un Email de una persona importante
    println(showImportantNotification(importantSms, importantPeopleInfo)) // Muestra Tienes un SMS de una persona importante
  }
}
