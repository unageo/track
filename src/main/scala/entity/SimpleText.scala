package entity

import java.time.LocalDateTime

case class SimpleText(text: String,
                      override val readableTitle: String,
                      override val id: String,
                      override val updatedById: String,
                      override val lastUpdated: LocalDateTime,
                      override val createdById: String,
                      override val createdDate: LocalDateTime) extends Trackable

object SimpleText {
  def apply(text: String,
            readableTitle: String,
            id: String,
            createdById: String): SimpleText = {
    val now: LocalDateTime = LocalDateTime.now()
    SimpleText(
      text,
      readableTitle,
      id,
      createdById,
      now,
      createdById,
      now)
  }
}