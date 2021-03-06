package com.hubspot.slack.client.methods.params.usergroups;

import java.util.Optional;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.hubspot.immutables.styles.HubSpotStyle;
import com.hubspot.slack.client.methods.interceptor.HasCommaSeperatedChannelIds;
import com.hubspot.slack.client.methods.interceptor.HasUsergroup;

@Immutable
@HubSpotStyle
@JsonNaming(SnakeCaseStrategy.class)
@JsonInclude(Include.NON_EMPTY)
public abstract class AbstractUsergroupUpdateParams implements HasCommaSeperatedChannelIds, HasUsergroup {
  public abstract Optional<String> getName();
  public abstract Optional<String> getDescription();
  public abstract Optional<String> getHandle();

  public abstract Optional<Boolean> getIncludeCount();

}
