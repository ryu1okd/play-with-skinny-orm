package controllers

import play.api.mvc._
import models.Company

object Application extends Controller {

  def index = Action {
//    Company.createWithAttributes('name -> "OKD", 'url -> "http://www.osakan-space.com/")
    Ok(views.html.application.index())
  }

  def show(id:Long) = Action {
    Ok(Company.findById(id).toString)
  }

  def skinny = Action {

    val strb = new StringBuilder

    strb.append(Company.columns)
    strb.append("\n")
    strb.append(Company.tableName)
    strb.append("\n")
    strb.append(Company.column)
    strb.append("\n")
    strb.append(Company.countAll())
    strb.append("\n")

    Ok(strb.toString())
  }


}
