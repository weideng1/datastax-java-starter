package com.datastax.sample.dao;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.Gauge;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Host;
import com.datastax.driver.core.KeyspaceMetadata;
import com.datastax.driver.core.Session;
import com.datastax.driver.dse.auth.DseGSSAPIAuthProvider;

public class SampleDao {

	private static Logger logger = LoggerFactory.getLogger(SampleDao.class);
	private Session session;

	private static String keyspaceName = "sample_keyspace";
	private static String testTable = keyspaceName + ".test";
	private List<KeyspaceMetadata> keyspaces;
	
	public SampleDao(String[] contactPoints) {

		Cluster cluster = Cluster.builder().addContactPoints(contactPoints)
			.withAuthProvider(DseGSSAPIAuthProvider.builder().build()).build();

		this.session = cluster.connect();
		this.keyspaces = cluster.getMetadata().getKeyspaces();
	}

	public List<KeyspaceMetadata> getKeyspaces() {
		return keyspaces;
	}

}
