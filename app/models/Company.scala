package models

import scalikejdbc._, SQLInterpolation._
import skinny.orm._, feature._
import org.joda.time.DateTime

/**
* Created with IntelliJ IDEA.
* User: okadaryuichi
* Date: 2014/01/18
* Time: 10:31
* To change this template use File | Settings | File Templates.
*/
case class Company(
                    id: Long,
                    name: String,
                    url: Option[String] = None,
                    createdAt: DateTime,
                    updatedAt: Option[DateTime] = None,
                    deletedAt: Option[DateTime] = None)

object Company extends SkinnyCRUDMapper[Company]
with TimestampsFeature[Company]
with SoftDeleteWithTimestampFeature[Company] {

  override val defaultAlias = createAlias("c")

  override def extract(rs: WrappedResultSet, c: ResultName[Company]): Company = new Company(
    id = rs.long(c.id),
    name = rs.string(c.name),
    url = rs.stringOpt(c.url),
    createdAt = rs.dateTime(c.createdAt),
    updatedAt = rs.dateTimeOpt(c.updatedAt)
  )
}