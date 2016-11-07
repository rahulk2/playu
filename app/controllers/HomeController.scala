package controllers

import java.io.File
import javax.inject._

import play.api.Play
import play.api.mvc._


@Singleton
class HomeController @Inject()(webJarAssets: WebJarAssets) extends Controller {

  def index = Action{
    Ok(views.html.index("Your new application is ready.",webJarAssets))
  }

  def streaming = Action {
    Ok.sendFile(new File("conf/small.mp4"))
  }
}
