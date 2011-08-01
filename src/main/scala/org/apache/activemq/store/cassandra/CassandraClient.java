package org.apache.activemq.store.cassandra;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import me.prettyprint.cassandra.service.CassandraHostConfigurator;
import me.prettyprint.hector.api.Cluster;
import me.prettyprint.hector.api.factory.HFactory;

import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.command.MessageId;
import org.apache.activemq.command.ProducerId;
import org.apache.activemq.command.SubscriptionInfo;
import org.apache.cassandra.utils.BloomFilter;

/**
 * Cassandra client that provides access to the data in Cassandra store.
 */
public class CassandraClient {
	
	private String cassandraHost;
	
	private int cassandraPort;
	
	private Cluster cassandraCluster;
	
	public CassandraClient(String host, int port) {
		this.cassandraHost = host;
		this.cassandraPort = port;
	}
	
	public CassandraClient() {	
	}
	
	public void start() {
		CassandraHostConfigurator chc = new CassandraHostConfigurator();
		chc.setHosts(cassandraHost);
		chc.setPort(cassandraPort);
		cassandraCluster = HFactory.createCluster("qsandra", chc);
		
	}
	
	public void stop() {
		HFactory.shutdownCluster(cassandraCluster);	
	}

	public String getHost() {
		return cassandraHost;
	}

	public void setCassandraHost(String host) {
		this.cassandraHost = host;
	}

	public int getCassandraPort() {
		return cassandraPort;
	}

	public void setCassandraPort(int port) {
		this.cassandraPort = port;
	}

	public void acknowledge(ActiveMQDestination destination, String clientId,
			String subscriptionName, MessageId messageId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSubscription(ActiveMQDestination destination,
			String clientId, String subscriptionName) {
		// TODO Auto-generated method stub
		
	}

	public long getLastAckStoreId(ActiveMQDestination destination,
			String clientId, String subscriptionName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<byte[]> recoverMessages(ActiveMQDestination destination,
			AtomicLong last, int maxValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSubscriberId(String clientId, String subscriptionName) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getStoreId(ActiveMQDestination destination, MessageId messageId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMessageCountFrom(ActiveMQDestination destination, long storeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SubscriptionInfo lookupSubscription(ActiveMQDestination destination,
			String clientId, String subscriptionName) {
		// TODO Auto-generated method stub
		return null;
	}

	public SubscriptionInfo[] lookupAllSubscriptions(
			ActiveMQDestination destination) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addSubscription(ActiveMQDestination destination,
			SubscriptionInfo subscriptionInfo, long lastAck) {
		// TODO Auto-generated method stub
		
	}

	public Set<ActiveMQDestination> getDestinations() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteQueue(ActiveMQQueue destination,
			AtomicInteger destinationCount) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTopic(ActiveMQTopic destination,
			AtomicInteger destinationCount) {
		// TODO Auto-generated method stub
		
	}

	public DestinationMaxIds getMaxStoreId() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getMaxProducerSequenceId(ProducerId id) {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getDestinationCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteMessage(ActiveMQDestination destination, MessageId id,
			AtomicLong queueSize) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllMessages(ActiveMQDestination destination,
			AtomicLong queueSize) {
		// TODO Auto-generated method stub
		
	}

	public int getMessageCount(ActiveMQDestination destination) {
		// TODO Auto-generated method stub
		return 0;
	}

	public BloomFilter getMessageIdFilterFor(ActiveMQDestination destination,
			long l) {
		// TODO Auto-generated method stub
		return null;
	}

	public byte[] getMessage(ActiveMQDestination destination, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveMessage(ActiveMQDestination destination,
			long incrementAndGet, MessageId messageId, byte[] marshall,
			AtomicLong queueSize, BloomFilter duplicateDetector) {
		// TODO Auto-generated method stub
		
	}

	public void createDestination(Object destinationKey, boolean b,
			AtomicInteger destinationCount) {
		// TODO Auto-generated method stub
		
	}
	
	

}
