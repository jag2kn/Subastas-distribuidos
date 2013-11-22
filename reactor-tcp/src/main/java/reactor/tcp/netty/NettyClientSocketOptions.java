package reactor.tcp.netty;

import io.netty.channel.ChannelPipeline;
import reactor.function.Consumer;
import reactor.tcp.config.ClientSocketOptions;

/**
 * @author Jon Brisbin
 */
public class NettyClientSocketOptions extends ClientSocketOptions {

	private Consumer<ChannelPipeline> pipelineConfigurer;

	public Consumer<ChannelPipeline> pipelineConfigurer() {
		return pipelineConfigurer;
	}

	public NettyClientSocketOptions pipelineConfigurer(Consumer<ChannelPipeline> pipelineConfigurer) {
		this.pipelineConfigurer = pipelineConfigurer;
		return this;
	}

}
