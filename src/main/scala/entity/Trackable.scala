package entity

import java.time.LocalDateTime

trait Trackable {
  val readableTitle: String
  val id: String
  val lastUpdated: LocalDateTime
  val updatedById: String
  val createdById: String
  val createdDate: LocalDateTime
}
