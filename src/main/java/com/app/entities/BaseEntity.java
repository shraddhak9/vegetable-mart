package com.app.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

    @MappedSuperclass
	public class BaseEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@CreationTimestamp
		@Column(name = "creation_date")
		private LocalDate creationDate;
		@UpdateTimestamp
		@Column(name = "updated_on")
		private LocalDate updatedOn;

		public BaseEntity() {

		}

		public long getid() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public LocalDate getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(LocalDate creationDate) {
			this.creationDate = creationDate;
		}

		public LocalDate getUpdatedOn() {
			return updatedOn;
		}

		public void setUpdatedOn(LocalDate updatedOn) {
			this.updatedOn = updatedOn;
		}

		@Override
		public String toString() {
			return "BaseEntity [id=" + id + ", creationDate=" + creationDate + ", updatedOn=" + updatedOn + "]";
		}

	}


